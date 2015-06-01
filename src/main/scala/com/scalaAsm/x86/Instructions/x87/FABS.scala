package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Absolute Value
// Category: general/arith

trait FABS extends InstructionDefinition {
  val mnemonic = "FABS"
}

object FABS extends ZeroOperands[FABS] with FABSImpl

trait FABSImpl extends FABS {
  implicit object FABS_0 extends _0 {
    val opcode: OneOpcode = 0xD9 /+ 4
        override def hasImplicitOperand = true
  }
}
