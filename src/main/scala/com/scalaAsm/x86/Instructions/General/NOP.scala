package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: No Operation
// Category: general/control

trait NOP extends InstructionDefinition {
  val mnemonic = "NOP"
}

object NOP extends ZeroOperands[NOP] with OneOperand[NOP] with NOPImpl

trait NOPLow extends NOP {
  implicit object _0 extends OneOp[rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x0D)
    val format = RmFormat
  }

  implicit object _1 extends OneOp[rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x0D)
    val format = RmFormat
  }
}

trait NOPImpl extends NOPLow {
  implicit object _2 extends NoOp{
    val opcode: OneOpcode = 0x90
      }
}
