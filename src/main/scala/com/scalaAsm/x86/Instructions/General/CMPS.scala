package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Compare String Operands
// Category: general/arithstring/binary

trait CMPS extends InstructionDefinition {
  val mnemonic = "CMPS"
}

object CMPS extends ZeroOperands[CMPS] with CMPSImpl

trait CMPSImpl extends CMPS {
  implicit object CMPS_0 extends _0 {
    val opcode: OneOpcode = 0xA6
        override def hasImplicitOperand = true
  }
}
