package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Compute 2x-1
// Category: general/trans

trait F2XM1 extends InstructionDefinition {
  val mnemonic = "F2XM1"
}

object F2XM1 extends ZeroOperands[F2XM1] with F2XM1Impl

trait F2XM1Impl extends F2XM1 {
  implicit object F2XM1_0 extends _0 {
    val opcode: OneOpcode = 0xD9 /+ 6
        override def hasImplicitOperand = true
    val hasRMByte = true
  }
}
